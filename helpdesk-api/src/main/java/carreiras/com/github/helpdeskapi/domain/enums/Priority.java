package carreiras.com.github.helpdeskapi.domain.enums;

public enum Priority {

    BAIXA(0, "BAIXA"),
    MEDIA(1, "MEDIA"),
    ALTA(2, "ALTA");

    private final Integer code;
    private final String description;

    Priority(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Priority toEnum(Integer code) {
        if (code == null)
            return null;

        for (Priority x : Priority.values())
            if (code.equals(x.getCode()))
                return x;

        throw new IllegalArgumentException("Prioridade inválida.");
    }
}
