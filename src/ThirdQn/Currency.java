package ThirdQn;

public enum Currency {
    RMB("Renminbi", 1, false),
    SGD("Singapore Dollar", 1, false),
    USDT("Tether", 2, true);

    private String name;
    private Integer type;
    private boolean isErc20;

    Currency(String name, Integer type, boolean isErc20) {
        this.name = name;
        this.type = type;
        this.isErc20 = isErc20;
    }

    public String getName() {
        return name;
    }

    public Integer getType() {
        return type;
    }

    public boolean isErc20() {
        return isErc20;
    }

    @Override
    public String toString() {
        return "Currency: name: " +name + ", type: " + type + ", isErc20: " +isErc20 + " ";
    }
}
