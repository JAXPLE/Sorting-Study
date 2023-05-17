package sort;

public enum SortingType implements Sort {
    BUBBLE {
        @Override
        public int[] sort(int[]array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length-1 -i; j++) {
                    if (array[j] > array[j+1]) {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
            return array;
        }
    },
    SELECTION {
        @Override
        public int[] sort(int[] array) {
            for (int i = 0; i < array.length-1; i++) {
                int idx = i;
                for (int j = i+1; j < array.length; j++) {
                    if (array[idx] < array[j]) {
                        idx = j;
                    }
                }
                int temp = array[i];
                array[i] = array[idx];
                array[idx] = temp;
            }
            return array;
        }
    },
    QUICK {
        @Override
        public int[] sort(int[] array) {
            //구현예정
            return new int[0];
        }
    };
}
