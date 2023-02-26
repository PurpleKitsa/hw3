package model;

import java.util.Objects;

public class Ingredient {
    private String name;
    private int count;
    private String measureUnit;
    public Ingredient(String name, int count, String measureUnit) {
        if (name != null) {

            this.name = name;
        } else {
            throw new RuntimeException("название ингридиента не введено");
        }
        if (count > 0) {

            this.count = count;
        } else {
            throw new RuntimeException("введено некоректное значение");
        }
        if (measureUnit != null) {
            measureUnit = measureUnit;
        } else {
            throw new RuntimeException(count + "введено некоректное значение");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return count == that.count && Objects.equals(name, that.name) && Objects.equals(measureUnit, that.measureUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count, measureUnit);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", measureUnit='" + measureUnit + '\'' +
                '}';
    }
}
