package _15_Template_method_pattern;

abstract class BeverageMaker {

    // The template method, marked as final to prevent subclasses from// overriding the algorithm's structure.
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourIntoCup();
        addCondiments();
    }

    // A common step for all beverages.
    private void boilWater() {
        System.out.println("Boiling water");
    }

    // A common step for all beverages.
    private void pourIntoCup() {
        System.out.println("Pouring into cup");
    }

    // Abstract methods to be implemented by concrete subclasses.
    protected abstract void brew();
    protected abstract void addCondiments();
}

 class Tea extends BeverageMaker {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea bag");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
 
 class Coffee extends BeverageMaker {
	    @Override
	    protected void brew() {
	        System.out.println("Dripping coffee through filter");
	    }

	    @Override
	    protected void addCondiments() {
	        System.out.println("Adding sugar and milk");
	    }
	}

 public class TemplateMethodExample {
	    public static void main(String[] args) {
	        System.out.println("--- Preparing Tea ---");
	        BeverageMaker tea = new Tea();
	        tea.prepareBeverage();

	        System.out.println("\n--- Preparing Coffee ---");
	        BeverageMaker coffee = new Coffee();
	        coffee.prepareBeverage();
	    }
	}
