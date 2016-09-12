/**
 * Created by yassirhessane on 13/08/16.
 */
public class AnimationProxy implements Animation {

    protected Film film = null;

    protected String photo = "Affichage de la photo";

    @Override
    public void dessine() {

        if (this.film != null)
        {
            this.film.dessine();
        }
        else
        {
            this.dessinePhoto(this.photo);
        }
    }

    @Override
    public void clic() {

        if (this.film == null)
        {
            this.film = new Film();
            this.film.charge();
        }
    }

    public void dessinePhoto(String photo)
    {
        System.out.println(this.photo);
    }
}
