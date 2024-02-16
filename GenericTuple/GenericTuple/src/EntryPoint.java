public class EntryPoint {

    public static void main(String[] args) {
        GenericTuple<Integer, Integer> point1 = new GenericTuple<>(1, 5);
        GenericTuple<Integer, Integer> point2 = new GenericTuple<>(1, 15);

        boolean result = Utilities.compare (point1, point2);
        System.out.println (result);

        GenericTuple<String, String> point3 = new GenericTuple<>("Hola", "Hola");
        GenericTuple<String, String> point4 = new GenericTuple<>("Hola", "Hola");

        boolean result2 = Utilities.compare (point3, point4);
        System.out.println (result2);

        GenericTuple<Double, Double> point5 = new GenericTuple<>(3.0, 7.0);
        GenericTuple<Double, Double> point6 = new GenericTuple<>(3.0, 15.5);

        boolean result3 = Utilities.compare (point5, point6);
        System.out.println (result3);
    }

}
