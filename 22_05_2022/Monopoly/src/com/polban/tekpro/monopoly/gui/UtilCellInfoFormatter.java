package com.polban.tekpro.monopoly.gui;

import com.polban.tekpro.monopoly.Cell;
import com.polban.tekpro.monopoly.OwnedCell;
import com.polban.tekpro.monopoly.Player;
import com.polban.tekpro.monopoly.UtilityCell;

public class UtilCellInfoFormatter implements CellInfoFormatter {

	public String format(Cell cell) {
        UtilityCell c = (UtilityCell)cell;
        StringBuffer buf = new StringBuffer();
        Player owner = ((OwnedCell) cell).getOwner();
        String ownerName = "";
        if(owner != null) {
        	ownerName = owner.getName();
        }
        buf.append("<html><b><font color='olive'>")
                .append(cell.getName())
                .append("</font></b><br>")
                .append("$").append(c.getPrice())
				.append("<br>Owner: ").append(ownerName)
                .append("</html>");
        return buf.toString();
	}
}
