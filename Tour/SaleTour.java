package Tour;

public class SaleTour extends TourDecorator {
	 private double saleAmount;

	 public SaleTour(Tour decoratedTour, double saleAmount) {
	     super(decoratedTour);
	     this.saleAmount = saleAmount;
	 }

	 @Override
	 public double getPrice() {
	     return decoratedTour.getPrice() - saleAmount;
	 }

	 @Override
	 public String getDescription() {
	     return decoratedTour.getDescription() + " Giam gia: " + saleAmount;
	 }
	}