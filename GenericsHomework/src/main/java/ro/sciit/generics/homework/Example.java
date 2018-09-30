package ro.sciit.generics.homework;

public class Example implements Comparable<Example> {

    private String name;
    private int value;

    public Example(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }


    @Override
    public int compareTo(Example o) {
        return this.getValue() - o.getValue();
    }

    @Override
    public String toString() {
        return "Example{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Example example = (Example) o;

        if (value != example.value) return false;
        return name.equals(example.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + value;
        return result;
    }
}
