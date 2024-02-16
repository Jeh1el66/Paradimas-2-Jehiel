public class Utilities {

       public static <T> boolean compare(GenericTuple<T, T> tuple1 , GenericTuple<T, T> tuple2) {
            return tuple1.getFirst().equals(tuple2.getFirst()) && tuple1.getSecond().equals(tuple2.getSecond());
        }





}


