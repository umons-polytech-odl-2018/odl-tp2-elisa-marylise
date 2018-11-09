package exercise2;

public class ProductionWorker implements Payable{

	private final int producedPieceRate;
	private int producedPiece = 0;

	protected ProductionWorker(int producedPieceRate) {
		this.producedPieceRate = producedPieceRate;


	}



	public void produceOnePiece() { producedPiece++; }

	public int computeSalary() {
		return producedPieceRate*producedPiece;
	}
}
