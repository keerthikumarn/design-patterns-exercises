package com.design.patterns.observer;

public class FitnessDataNaive {
	
	private int steps;
    private int activeMinutes;
    private int calories;

    private LiveActivityDisplayNaive liveDisplay;
    private ProgressLoggerNaive progressLogger;
    private NotificationServiceNaive notificationService;

    public FitnessDataNaive(LiveActivityDisplayNaive ld, ProgressLoggerNaive pl, NotificationServiceNaive ns) {
        this.liveDisplay = ld;
        this.progressLogger = pl;
        this.notificationService = ns;
    }

    public void newFitnessDataPushed(int newSteps, int newActiveMinutes, int newCalories) {
        this.steps = newSteps;
        this.activeMinutes = newActiveMinutes;
        this.calories = newCalories;
        System.out.println("\nFitnessDataNaive: New data received - Steps:" + steps +
                           ", ActiveMins:" + activeMinutes + ", Calories:" + calories);
        liveDisplay.showStats(steps, activeMinutes, calories);
        progressLogger.logDataPoint(steps, activeMinutes, calories);
        notificationService.checkAndNotify(steps);
    }

    public void dailyReset() {
        notificationService.resetDailyNotifications();
        System.out.println("FitnessDataNaive: Daily data reset.");
        newFitnessDataPushed(0,0,0); // Notify of reset state
    }

}
