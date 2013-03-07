import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AboutDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AboutDialog dialog = new AboutDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AboutDialog() {
		setTitle("About");
		setResizable(false);
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		{
			JLabel lblNewLabel = new JLabel("Faronora Game for CSCE 315");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("By Team 03:");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Austin Dalton, Nathan Douthit, Miles Hickman");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new MigLayout("", "[54px][54px][54px][54px][][][][][54px][54px][54px][54px]", "[23px]"));
			{
				JLabel label = new JLabel("");
				buttonPane.add(label, "cell 0 0,grow");
			}
			{
				JLabel label = new JLabel("");
				buttonPane.add(label, "cell 1 0,grow");
			}
			{
				JLabel label = new JLabel("");
				buttonPane.add(label, "cell 2 0,grow");
			}
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setVerticalAlignment(SwingConstants.BOTTOM);
				buttonPane.add(okButton, "cell 6 0,grow");
				okButton.setActionCommand("OK");
				getRootPane().setDefaultButton(okButton);
			}
			{
				JLabel label = new JLabel("");
				buttonPane.add(label, "cell 8 0,grow");
			}
			{
				JLabel label = new JLabel("");
				buttonPane.add(label, "cell 9 0,grow");
			}
			{
				JLabel label = new JLabel("");
				buttonPane.add(label, "cell 10 0,grow");
			}
			{
				JLabel label = new JLabel("");
				buttonPane.add(label, "cell 11 0,grow");
			}
		}
	}

}
