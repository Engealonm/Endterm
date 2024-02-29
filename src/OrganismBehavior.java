interface OrganismBehavior {
    void grow();
    void reproduce(Organism partner);
    void move(String direction);
    void interact(Organism target);
}
