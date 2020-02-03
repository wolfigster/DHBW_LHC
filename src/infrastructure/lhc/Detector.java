package infrastructure.lhc;

import com.google.common.eventbus.Subscribe;
import infrastructure.lhc.experiment.Experiment;
import infrastructure.security.device.Reader;
import infrastructure.security.management.Configuration;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.LinkedList;

public class Detector extends Subscriber implements IDetector {

    private static String higgsBosonStructure = "higgs";
    private boolean isActivated;
    private LinkedList<Experiment> experimentList;
    private Reader reader;

    public Detector(boolean isActivated, LinkedList<Experiment> experimentList, Reader reader) {
        this.isActivated = isActivated;
        this.experimentList = experimentList;
        this.reader = reader;
    }

    public boolean isActivated() {
        return this.isActivated;
    }

    public Reader getReader() {
        return this.reader;
    }

    @Override
    public LinkedList<Experiment> getExperimentList() {
        return this.experimentList;
    }

    @Subscribe
    public void receive(Analyse analyse) {

    }

    public void search(Experiment experiment) {
        String searchString = "higgs";

        Class<?> clazz = null;
        Object instance = null;
        Object port = null;

        String nameOfClass = Configuration.getSearchAlgorithm().getName();
        String pathOfJavaArchive = Configuration.getSearchAlgorithm().getPath();

        System.out.println("--- loadClazzFromJavaArchive");
        try {
            URL[] urls = {new File(pathOfJavaArchive).toURI().toURL()};
            URLClassLoader urlClassLoader = new URLClassLoader(urls, Detector.class.getClassLoader());
            clazz = Class.forName(nameOfClass, true, urlClassLoader);
            System.out.println("class    : " + clazz.toString() + " - " + clazz.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("--- provideInstanceOfClass");
        try {
            instance = clazz.getMethod("getInstance").invoke(null);
            System.out.println("instance : " + instance.toString() + " - " + instance.hashCode());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("--- provideComponentPort");
        try {
            port = clazz.getDeclaredField("port").get(instance);
            System.out.println("port     : " + port.toString() + " - " + port.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("--- executeSearchMethodUsingPort");
        try {
            Method method = port.getClass().getMethod("search", String.class, String.class);
            System.out.println(method);

            int result = (int) method.invoke(port, searchString, higgsBosonStructure);
            System.out.println("result   : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
