package racingcar.model;

import java.util.*;

public class Cars {
    private Set<Car> cars = new LinkedHashSet<>();

    public Cars(String[] carNames) {
        if (this.isOverlap(carNames)) {
            throw new IllegalArgumentException("중복된 이름이 있습니다.");
        }
    }

    private boolean isOverlap(String[] carNames) {
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        return carNames.length != cars.size();
    }

    public boolean isEqualCars(Set<Car> cars) {
        return this.cars.equals(cars);
    }

    public void moveCars() {
        for (Car car : cars) {
            car.move(Random.createRandomNumber());
        }
    }

    public WinningCars getWinnerCars() {
        return new WinningCars(cars);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.toString()).append("\n");
        }
        return sb.toString();
    }

}
