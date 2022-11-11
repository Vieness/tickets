import java.util.List;

public class Cinema {

    private List<Session> sessions = List.of(
            new Session("Forrest Gump", new StandardHall()),
            new Session("Avatar", new MiniHall()),
            new Session("Titanic", new BigHall()));

    public List<Session> getSessions() {
        return sessions;
    }
}
