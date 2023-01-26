public enum status {
    run("跑步"),
    study("学习"),
    sleep("睡觉");

    private String name;

    status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
