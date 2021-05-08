package za.co.entelect.challenge.command;

public class BananaCommand implements Command{
    private final int x;
    private final int y;

    public BananaCommand(Position position) {
        this.x = position.x;
        this.y = position.y;
    }

    @Override
    public String render() {
        return String.format("banana %d %d", x, y);
    }
}
