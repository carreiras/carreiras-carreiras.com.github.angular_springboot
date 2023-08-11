package carreiras.com.github.helpdeskapi.domain.enums;

public enum Status {

    ABERTO(0, "ABERTO"),
    ANDAMENTO(1, "ANDAMENTO"),
    ENCERRADO(2, "ENCERRADO");

    private final Integer code;
    private final String description;

    Status(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Status toEnum(Integer code) {
        if (code == null)
            return null;

        for (Status x : Status.values())
            if (code.equals(x.getCode()))
                return x;

        throw new IllegalArgumentException("Status inválido.");
    }
}
