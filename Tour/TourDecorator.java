package Tour;


public abstract class TourDecorator extends Tour {
 protected Tour decoratedTour;

 public TourDecorator(Tour decoratedTour) {
     super(decoratedTour.name, decoratedTour.description, decoratedTour.days, decoratedTour.basePrice);
     this.decoratedTour = decoratedTour;
 }

 @Override
 public abstract double getPrice();

 @Override
 public abstract String getDescription();
}


