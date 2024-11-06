public interface MultisetInterface<T> {
    boolean notEmpty();
    void add(T element);
    int mult(MultiSet<T> autre);
    boolean appartient(T element);
    MultiSet<T> union(MultiSet<T> autre);
    MultiSet<T> inter(MultiSet<T> autre);
    int card();
    boolean inclus(MultiSet<T> autre);
    boolean inclusEq(MultiSet<T> autre);
}
