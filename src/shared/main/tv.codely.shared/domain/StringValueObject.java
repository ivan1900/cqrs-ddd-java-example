package tv.codely.shared.domain;

import java.util.Objects;

abstract public class StringValueObject {
    private final String value;

    public StringValueObject(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StringValueObject)) return false;
        StringValueObject that = (StringValueObject) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}