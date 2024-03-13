public class Main {
    public static void main(String[] args) {
        Stream stream1 = new Stream(1);
        Stream stream2 = new Stream(2);
        Stream stream3 = new Stream(3);

        StudyGroup studyGroup1 = new StudyGroup("ФТ-1201", 12);
        StudyGroup studyGroup2 = new StudyGroup("ФТ-1202", 11);
        StudyGroup studyGroup3 = new StudyGroup("ФТ-1203", 13);
        StudyGroup studyGroup4 = new StudyGroup("ФТ-1204", 12);
        StudyGroup studyGroup5 = new StudyGroup("ФТ-1301", 15);
        StudyGroup studyGroup6 = new StudyGroup("ФТ-1302", 14);
        StudyGroup studyGroup7 = new StudyGroup("ФТ-1303", 12);
        StudyGroup studyGroup8 = new StudyGroup("ФТ-1401", 11);
        StudyGroup studyGroup9 = new StudyGroup("ФТ-1402", 15);

        stream1.add(studyGroup1);
        stream1.add(studyGroup2);
        stream1.add(studyGroup3);
        stream1.add(studyGroup4);

        System.out.println(stream1);
        stream2.add(studyGroup5);
        stream2.add(studyGroup6);
        stream2.add(studyGroup7);
        System.out.println(stream2);
        stream3.add(studyGroup8);
        stream3.add(studyGroup9);
        System.out.println(stream3);

        StreamComparator streamComparator = new StreamComparator();
        System.out.println();
        System.out.println("Результат сравнения потоков №" + stream3.getStreamID() +" и №"+
                stream1.getStreamID() +": " + streamComparator.compare(stream3,stream1));


    }
}