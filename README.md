# CellGenerator

    The board is given with size M x N cell.  Each cell can be  in one of two stages: 1 - alive, 0 - dead.
Each cell coop with the next 8 neighbours. 
    Rules of cooperation:

        A living cell that has fewer than two living neighbors dies.

        A living cell that has two or three living neighbors survives.

        A living cell that has more than three living neighbors dies.

        A dead cell that has three living neighbors is reborn.
The program can generate map and represent it onec in a second, of it is possible to receive map from file.