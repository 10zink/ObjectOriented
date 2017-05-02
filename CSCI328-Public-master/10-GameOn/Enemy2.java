public class Enemy2 extends GameObject
{
  public Enemy2(int x, int y, int w, int h, int dX, int dY)
  {
    super("./Enemy2.png", x, y, w, h, dX, dY);
  }

  @Override
  public void tick(int maxw, int maxh)
  {
    //adding stuff to equation
    m_x = m_x + m_dX + m_dX;
    m_y = m_y + m_dY - m_dY;

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
