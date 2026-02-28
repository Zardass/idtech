package lesson37;

public class Main2 {
    public static void main(String[] args) {
        CardRepository cardRepository = new SimpleCardRepository();
        CardService cardService = new CardService(cardRepository);

        cardService.getCardInfoById(123L);
    }
}

class CardService {
    private final CardRepository cardRepository;

    CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void getCardInfoById(Long id){
        cardRepository.findById(id);
    }
}

interface CardRepository {
    void findById(Long id);
}

class SimpleCardRepository implements CardRepository {
    @Override
    public void findById(Long id) {
        System.out.println("Find by id: " + id);
    }
}
