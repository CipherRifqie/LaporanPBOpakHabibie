package unittest;

import backend.Anggota1841720065Rifqie;
import backend.Kategori1841720065Rifqie;
import learnunittesting.MessageProcessor1841720065Rifqie;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1841720065Rifqie {
    public static void main(String[] args) {
        Result mResult = JUnitCore.runClasses(MessageProcessor1841720065Rifqie.class);
        showMessageResultRifqie(mResult, MessageProcessor1841720065Rifqie.class.getSimpleName());

        mResult = JUnitCore.runClasses(Kategori1841720065Rifqie.class);
        showMessageResultRifqie(mResult, Kategori1841720065Rifqie.class.getSimpleName());

        mResult = JUnitCore.runClasses(Anggota1841720065Rifqie.class);
        showMessageResultRifqie(mResult, Anggota1841720065Rifqie.class.getSimpleName());
    }

    private static void showMessageResultRifqie(Result mResult, String className) {
        if (mResult.wasSuccessful()) {
            System.out.format("The result Test from %s : %s\n", className, mResult.wasSuccessful());
        } else {
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
