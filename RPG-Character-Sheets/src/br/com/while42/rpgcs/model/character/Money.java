package br.com.while42.rpgcs.model.character;

import java.io.Serializable;

public class Money implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long copperPiece = 0L;
	private Long silverPiece = 0L;
	private Long goldPiece = 0L;
	private Long platinumPiece = 0L;

	public Long getCopperPiece() {
		return copperPiece;
	}

	public void setCopperPiece(Long copperPiece) {
		this.copperPiece = copperPiece;
	}

	public Long getSilverPiece() {
		return silverPiece;
	}

	public void setSilverPiece(Long silverPiece) {
		this.silverPiece = silverPiece;
	}

	public Long getGoldPiece() {
		return goldPiece;
	}

	public void setGoldPiece(Long goldPiece) {
		this.goldPiece = goldPiece;
	}

	public Long getPlatinumPiece() {
		return platinumPiece;
	}

	public void setPlatinumPiece(Long platinumPiece) {
		this.platinumPiece = platinumPiece;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		
		sb.append(" Copper Piece: ").append(copperPiece);
		sb.append(" Silver Piece: ").append(silverPiece);
		sb.append(" Gold Piece: ").append(goldPiece);
		sb.append(" PlatinumP iece: ").append(platinumPiece);
		
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof Money))
			return false;

		Money money = (Money) o;

		return copperPiece.equals(money.copperPiece) && 
				silverPiece.equals(money.silverPiece) &&
				goldPiece.equals(money.goldPiece) &&
				platinumPiece.equals(money.platinumPiece);
	}
	
	@Override
	public int hashCode() {
		return copperPiece.intValue() + silverPiece.intValue() + goldPiece.intValue() + platinumPiece.intValue();
	}

}
