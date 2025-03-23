package Tour;

public class VisitFamilyTour extends TourDecorator {
	 public VisitFamilyTour(Tour decoratedTour) {
	     super(decoratedTour);
	 }

	 @Override
	 public double getPrice() {
	     return decoratedTour.getPrice() * 1.05;
	 }

	 @Override
	 public String getDescription() {
	     return decoratedTour.getDescription() + " Tham than nhan";
	 }
	}