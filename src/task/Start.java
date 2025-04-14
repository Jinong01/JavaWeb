package task;

import java.sql.SQLException;
import task.view.View;

public class Start {

	public static void main(String[] args) throws SQLException {
		
		View.getInstance().mainView();
	}

}
