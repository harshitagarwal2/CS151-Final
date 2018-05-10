import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.TransferHandler;
import java.awt.Container;

public class TaskColomn extends JFrame {
	private int colsize;
	private JPanel[] columnPanels;
	public TaskColomn(String[] columns) {
		this.setLayout(new BorderLayout());
		this.colsize = columns.length;
		JPanel columnPanel = new JPanel();
		columnPanel.setLayout(new GridLayout(0,colsize));
		columnPanels = new JPanel[colsize];

		for (int i = 0; i < colsize; i++) {
			columnPanels[i] = new JPanel();
			columnPanels[i].setLayout(new BoxLayout(columnPanels[i], BoxLayout.PAGE_AXIS));
			columnPanel.add(columnPanels[i]);
		}
		
		// Add the column Name
		for (int i = 0; i < colsize; i++) {
			JLabel label = new JLabel(columns[i]);
			label.setBorder(BorderFactory.createMatteBorder(2, 
                                                                2, 
                                                                2, 
                                                                2, 
                                                                Color.BLACK));
			label.setTransferHandler(new TransferHandler("text"));

		    /*label.addMouseListener(new MouseAdapter() {
		      public void mousePressed(MouseEvent evt) {
		        JComponent comp = (JComponent) evt.getSource();
		        TransferHandler th = comp.getTransferHandler();

		        th.exportAsDrag(comp, evt, TransferHandler.COPY);
		      }
		    });*/
			columnPanels[i].add(label);
			
		}
		for (int i = 0; i < colsize; i++) {
			final int j = i;
			JButton jb = new JButton("+");
			jb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae ) {
					columnPanels[j].add(new JLabel("new task"));
					columnPanel.revalidate();
					columnPanel.repaint();
				}
			});
			columnPanels[i].add(jb);
		}
		int j = 0;
		



		this.add(columnPanel, BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		TaskColomn ms = new TaskColomn(args);
	}
}