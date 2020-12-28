package guru.sfg.brewery.model.events;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {
    public NewInventoryEvent(BeerDTO beerDto) {
        super(beerDto);
    }
}
