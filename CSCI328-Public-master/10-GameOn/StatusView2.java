import javax.swing.*;
import java.awt.BorderLayout;
import java.util.*;

class StatusView2 extends JPanel implements IGameView
{
  private JLabel m_status = new JLabel();
  List<IGameObject> m_objects;
  public StatusView2(List<IGameObject> objects)
  {
    m_objects = objects;
    setLayout(new BorderLayout());
    m_status.setText("");
    add(m_status, BorderLayout.CENTER);
  }

  @Override
  public void tick()
  {
    if (m_objects.size()> 1)
    {
        m_status.setText(String.format("Player Position X: %s Y:%s                Enemy Position X: %s EY: %s", //copy and change it to
          m_objects.get(1).getX(), m_objects.get(1).getY(),
          m_objects.get(0).getX(), m_objects.get(0).getY()));
    }
  }

  @Override
  public JPanel getJPanel()
  {
    return this;
  }
}
