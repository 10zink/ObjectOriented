public class Enemy4 extends GameObject
{
  public Enemy4(int x, int y, int w, int h, int dX, int dY)
  {
    super("./Enemy4.png", x, y, w, h, dX, dY);
  }

  @Override
  public void tick(int maxw, int maxh)
  {
    m_x = (m_x - m_dX)-2;
    m_y = (m_y - m_dY)-2;

    if (m_x > maxw)
      m_x = 0;
    else if (m_x < 0)
      m_x = maxw;

    if (m_y > maxh)
      m_y = 0;
    else if (m_y < 0)
      m_y = maxh;

  }

}
