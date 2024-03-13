import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup>{
    private int streamID;
    private List<StudyGroup> groups;

    public Stream(Integer streamID) {
        this.streamID = streamID;
        this.groups = new ArrayList<>();
    }

    public void add(StudyGroup group) {
        this.groups.add(group);
    }

    public int getStreamID() {
        return streamID;

    }

    public List<StudyGroup> getGroups() {
        return groups;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("\nПоток: " + streamID + " количество групп: " + groups.size() +
                "\nГруппы, входящие в поток:");
        for (StudyGroup group : groups) {
            result.append("\n").append(group.toString());
        }
        return result.toString();
    }

    public Iterator<StudyGroup> iterator() {
        return groups.iterator();
    }

    public int compareTo(Stream streamToCompare) {
        return Integer.compare(this.getGroups().size(), streamToCompare.getGroups().size());
    }
}
