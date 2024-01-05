package Alishev.TestLambda;

public class Islands {

        public static void main(String[] args) {

            //формируем расположение островов:
            var map = new char[][]{
                    new char[]{'1','0','1','1','0'},
                    new char[]{'1','0','0','1','0'},
                    new char[]{'1','0','0','1','0'},
                    new char[]{'1','1','1','1','0'}
            };
            System.out.println("Количество островов: " + howMuchlands(map));
        }

        //метод обхода острова, который принимает матрицу и координаты:
        private static void markIsland(char[][] matrix, int x, int y) {
            int xLength = matrix.length;
            int yLength = matrix[0].length;

            //условие выхода за край матрицы:
            if (x < 0 || y < 0 || x >= xLength || y >= yLength || matrix[x][y] == '0') {
                return;
            }

            //если не вышли за границу, помечаем ячейку как 0:
            matrix[x][y] = '0';

            //осматриваемся:
            markIsland(matrix, x - 1, y); //вверх
            markIsland(matrix, x + 1, y); //вниз
            markIsland(matrix, x, y - 1); //влево
            markIsland(matrix, x, y + 1); //вправо
        }

        //метод расчёта:
        public static int howMuchlands(char[][] matrix) {
            int xLength = matrix.length;
            if (xLength == 0) return 0;
            int yLength = matrix[0].length;
            //переменная, хранящая кол-во островов:
            int numIslands = 0;

            //перебор строк:
            for (int i = 0; i < xLength; i++) {
                //перебор столбцов:
                for (int j = 0; j < yLength; j++) {
                    if (matrix[i][j] == '1') {
                        //если находим "1", то увеличиваем каунтер островов:
                        numIslands++;
                        //запускаем метод обхода острова по периметру:
                        markIsland(matrix, i, j);
                    }
                }
            }
            return numIslands;
        }
    }


