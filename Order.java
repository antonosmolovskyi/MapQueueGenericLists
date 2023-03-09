package lista;

public class Order extends Entity {
	private long oderId;
	private double amount;

	public Order() {
	}

	public long getOderId() {
		return oderId;
	}

	public void setOderId(long oderId) {
		this.oderId = oderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (oderId ^ (oderId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (oderId != other.oderId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [oderId=" + oderId + ", amount=" + amount + "]";
	}

	public Order(long oderId, double amount) {
		super();
		this.oderId = oderId;
		this.amount = amount;
	}

}
