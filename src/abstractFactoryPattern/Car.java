package abstractFactoryPattern;

public interface Car<B, M> {
    public void setModel(M model);
    public void drive();
}