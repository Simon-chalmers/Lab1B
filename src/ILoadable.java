public interface ILoadable {

    /**
     * @param load Adds loadable item
     */
    void addItem(Load load);

    /**
     * @param load removes loadable item
     * @return
     */
    Load removeItem(Load load);
}
