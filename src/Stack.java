public class Stack {
    private Double[] inner;
    private Integer elemCount;
    private Integer maxElemCount;

    Stack(Integer size) {
        this.inner = new Double[size];
        this.maxElemCount = size;
    } 

    public void push(Double elem) {
        if (elemCount + 1 > maxElemCount)
            return;
        this.inner[elemCount++] = elem;
    }
    public Double pop(Double elem) {
        if (elemCount + 1 > maxElemCount)
            return null;
        return this.inner[elemCount--]; 
    }
}