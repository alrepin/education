package ga.repin.education.course02.topic02_2.hw;

public interface EngineInstalled {
    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
