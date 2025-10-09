package com.design.patterns.observer;

public interface FitnessInterface {

	void registerObserver(FitnessDataObserver o);

	void removeObserver(FitnessDataObserver o);

	void notifyObservers();

}
