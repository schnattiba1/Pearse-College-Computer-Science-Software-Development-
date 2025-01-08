// Parent class or a superclass
public abstract class Student {
    abstract void introduction();
    abstract void studentResults();

    // Template method
    public final void showResults() {
        introduction();
        studentResults();
    } 
}
