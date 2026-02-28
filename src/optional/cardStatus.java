package optional;

    public enum cardStatus {
        ACTIVE("1"),
        PASSIVE("1");


        private final String number;

        cardStatus(String number) {
            this.number = number;
        }


    }

    class Test{
        public static void main(String[] args) {
           cardStatus cs = cardStatus.ACTIVE;
            System.out.println(cs.ordinal());
            for (cardStatus c : cardStatus.values()) {
                System.out.println(c);
            }

        }
    }

