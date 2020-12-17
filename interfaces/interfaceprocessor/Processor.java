package interfaces.interfaceprocessor;

public interface Processor {
    String name(); // 接口中的域和方法都是自动 static 和 final 的
    Object process(Object input);
}
