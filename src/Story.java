public class Story {
    private Situation start_story;
    public Situation current_situation;

    Story() {
        start_story = new Situation(
                "Знакомство",
                "Вы пришли на экзамен. Вы готовы? \n"
                        + "(1) Да, готов!\n"
                        + "(2) Пожалуй нет.\n",
                2, 0);
        start_story.direction[0] = new Situation(
                "Итак, первый вопрос.",
                "Сколько будет 2+2*2? \n"
                + "(1) 6 \n"
                + "(2) 8 \n"
                + "(3) 12\n",
                3, 0);
        start_story.direction[0].direction[0] = new Situation(
                "Да, правильно!",
                "Следующий вопрос: Cколько планет в нашей Солнечной Системе? \n"
                        + "(1) 6 \n"
                        + "(2) 8 \n"
                        + "(3) 12 \n",
                3, 1);
        start_story.direction[0].direction[1] = new Situation(
                "К сожалению не правильно. Правильный ответ: 6.",
                "Следующий вопрос: какое максимальное десятичное число можно записать в 1 байт ? \n"
                        + "(1) 255 \n"
                        + "(2) 256 \n"
                        + "(3) 1024 \n",
                3, 0);
        start_story.direction[0].direction[2] = new Situation(
                "К сожалению не правильно. Правильный ответ: 6.",
                "Следующий вопрос: назовите цифры двоичной системы счисления. \n"
                        + "(1) 1 и 2 \n"
                        + "(2) 1 и 0\n"
                        + "(3) 0, 1 и 2 \n",
                3, 0);
        start_story.direction[0].direction[0].direction[0] = new Situation(
                "К сожалению не правильно. Правильный ответ: 8.",
                "Следующий вопрос: Электричка едет со скоростью 70 км/час. В какую сторону летит дым? \n"
                        + "(1) по направлению движения \n"
                        + "(2) против направления движения \n"
                        + "(3) правильного ответа нет\n",
                3, 0);
        start_story.direction[0].direction[0].direction[1] = new Situation(
                "Да, правильно!",
                "Следующий вопрос: Единица измерения силы тока - это? \n"
                        + "(1) Вольт \n"
                        + "(2) Ватт \n"
                        + "(3) Ампер \n",
                3, 1);
        start_story.direction[0].direction[0].direction[2] = new Situation(
                "К сожалению не правильно. Правильный ответ: 8.",
                "Следующий вопрос: Сатурн - это какая планета по счету от Солнца? \n"
                        + "(1) 6 \n"
                        + "(2) 7 \n"
                        + "(3) 8 \n",
                3, 0);
        start_story.direction[0].direction[1].direction[0] = new Situation(
                "Да, правильно!",
                "Следующий вопрос: Какой элемент Периодической системы Д.И. Менделеева обозначается как Ag? \n"
                        + "(1) Золото \n"
                        + "(2) Серебро \n"
                        + "(3) Аргон \n",
                3, 1);
        start_story.direction[0].direction[1].direction[1] = new Situation(
                "К сожалению не правильно. Правильный ответ: 255.",
                "Следующий вопрос: Какая самая длинная река в мире? \n"
                        + "(1) Амазонка \n"
                        + "(2) Нил \n"
                        + "(3) Янцзы \n",
                3, 0);
        start_story.direction[0].direction[1].direction[2] = new Situation(
                "К сожалению не правильно. Правильный ответ: 255.",
                "Следующий вопрос: Прискавка 'гекто-' это сколько? \n"
                        + "(1) 1000 \n"
                        + "(2) 100 \n"
                        + "(3) 10 \n",
                3, 0);
        start_story.direction[0].direction[2].direction[0] = new Situation(
                "К сожалению не правильно. Правильный ответ: 1 и 0.",
                "Следующий вопрос: Сколько хромосом в геноме у человека? \n"
                        + "(1) 42 \n"
                        + "(2) 44 \n"
                        + "(3) 46 \n",
                3, 0);
        start_story.direction[0].direction[2].direction[1] = new Situation(
                "Да, правильно!",
                "Следующий вопрос: В каком году люди впервые высадились на Луну? \n"
                        + "(1) 1972 \n"
                        + "(2) 1969 \n"
                        + "(3) 1958 \n",
                3, 1);
        start_story.direction[0].direction[2].direction[2] = new Situation(
                "К сожалению не правильно. Правильный ответ: 1 и 0.",
                "Следующий вопрос: Сколько существует законов Ньютона? \n"
                        + "(1) 3 \n"
                        + "(2) 2 \n"
                        + "(3) 1 \n",
                3, 0);
        start_story.direction[0].direction[0].direction[0].direction[0] = new Situation(
                "К сожалению не правильно. Правильный ответ : правильного ответа нет.",
                "Следующий вопрос: Сколько всего на нашей планете океанов? \n"
                        + "(1) 4 \n"
                        + "(2) 5 \n"
                        + "(3) 6 \n",
                0, 0);
        start_story.direction[0].direction[0].direction[0].direction[1] = new Situation(
                "К сожалению не правильно. Правильный ответ : правильного ответа нет.",
                "Следующий вопрос: Столица Австралии? \n"
                        + "(1) Канберра \n"
                        + "(2) Сидней \n"
                        + "(3) Мельбурн \n",
                0, 0);
        start_story.direction[0].direction[0].direction[0].direction[2] = new Situation(
                "Да, правильно!",
                "Следующий вопрос: Сколько материков на наше1 планете? \n"
                        + "(1) 6 \n"
                        + "(2) 7 \n"
                        + "(3) 5 \n",
                0, 1);
        start_story.direction[0].direction[0].direction[1].direction[0] = new Situation(
                "К сожалению не правильно. Правильный ответ : Ампер.",
                "Следующий вопрос: Кто такой Никола Тэсла? \n"
                        + "(1) Химик \n"
                        + "(2) Физик \n"
                        + "(3) Математик \n",
                0, 0);
        start_story.direction[0].direction[0].direction[1].direction[1] = new Situation(
                "К сожалению не правильно. Правильный ответ : Ампер.",
                "Следующий вопрос: Самая сильная мышца человеческого тела? \n"
                        + "(1) язык \n"
                        + "(2) палец \n"
                        + "(3) все мыщцы одинаково сильные \n",
                0, 0);
        start_story.direction[0].direction[0].direction[1].direction[2] = new Situation(
                "Да, правильно!",
                "Следующий вопрос: Сколько зубов у человека? \n"
                        + "(1) 33 \n"
                        + "(2) 32 \n"
                        + "(3) 31 \n",
                0, 1);
        start_story.direction[0].direction[0].direction[2].direction[0] = new Situation(
                "Да, правильно!",
                "Следующий вопрос: Чему ровно число «Пи»? \n"
                        + "(1) 3.14 \n"
                        + "(2) 6.28 \n"
                        + "(3) 1.07 \n",
                0, 1);
        start_story.direction[0].direction[0].direction[2].direction[1] = new Situation(
                "К сожалению не правильно. Правильный ответ : 6.",
                "Следующий вопрос: Кто написал «Мастера и Маргариту»? \n"
                        + "(1) Пушкин \n"
                        + "(2) Булгаков \n"
                        + "(3) Грибоедов \n",
                0, 0);
        start_story.direction[0].direction[0].direction[2].direction[2] = new Situation(
                "К сожалению не правильно. Правильный ответ : 6.",
                "Следующий вопрос: Как называется прямая, ограниченная точками? \n"
                        + "(1) отрезок \n"
                        + "(2) луч \n"
                        + "(3) прямая \n",
                0, 0);
        start_story.direction[0].direction[1].direction[0].direction[0] = new Situation(
                "К сожалению не правильно. Правильный ответ : Серебро.",
                "Следующий вопрос: Какова температура замерзания воды? \n"
                        + "(1) -1 \n"
                        + "(2) 0 \n"
                        + "(3) 1 \n",
                0, 0);
        start_story.direction[0].direction[1].direction[0].direction[1] = new Situation(
                "Да, правильно!",
                "Следующий вопрос: Как выглядит символ натрия? \n"
                        + "(1) Na \n"
                        + "(2) K \n"
                        + "(3) Ca \n",
                0, 1);
        start_story.direction[0].direction[1].direction[0].direction[2] = new Situation(
                "К сожалению не правильно. Правильный ответ : Серебро.",
                "Следующий вопрос: Сколько известных человеку химических элементов? \n"
                        + "(1) 118 \n"
                        + "(2) 164 \n"
                        + "(3) 114 \n",
                0, 0);
        start_story.direction[0].direction[1].direction[1].direction[0] = new Situation(
                "Да, правильно!",
                "Следующий вопрос: Жанр произведения А.С. Пушкина `Няне`? \n"
                        + "(1) сказка \n"
                        + "(2) рассказ \n"
                        + "(3) стих \n",
                0, 1);
        start_story.direction[0].direction[1].direction[1].direction[1] = new Situation(
                "К сожалению не правильно. Правильный ответ : Амазонка.",
                "Следующий вопрос: Что меньше: 40 центнеров или 4 тонны?\n"
                        + "(1) 40 центнеров \n"
                        + "(2) 4 тонны \n"
                        + "(3) одинаково \n",
                0, 0);
        start_story.direction[0].direction[1].direction[1].direction[2] = new Situation(
                "К сожалению не правильно. Правильный ответ : Амазонка.",
                "Следующий вопрос: Цветы, собранные в пучок? \n"
                        + "(1) букет \n"
                        + "(2) веник \n"
                        + "(3) клумба \n",
                0, 0);
        start_story.direction[0].direction[1].direction[2].direction[0] = new Situation(
                "К сожалению не правильно. Правильный ответ : 100.",
                "Следующий вопрос: Цветы, собранные в пучок? \n"
                        + "(1) букет \n"
                        + "(2) веник \n"
                        + "(3) клумба \n",
                0, 0);
        start_story.direction[0].direction[1].direction[2].direction[1] = new Situation(
                "Да, правильно!",
                "Следующий вопрос: Цветы, собранные в пучок? \n"
                        + "(1) букет \n"
                        + "(2) веник \n"
                        + "(3) клумба \n",
                0, 1);
        start_story.direction[0].direction[1].direction[2].direction[2] = new Situation(
                "К сожалению не правильно. Правильный ответ : 100.",
                "Следующий вопрос: Цветы, собранные в пучок? \n"
                        + "(1) букет \n"
                        + "(2) веник \n"
                        + "(3) клумба \n",
                0, 0);
        start_story.direction[0].direction[2].direction[0].direction[0] = new Situation(
                "К сожалению не правильно. Правильный ответ : 46.",
                "Следующий вопрос: Жанр произведения А.С. Пушкина `Няне`? \n"
                        + "(1) сказка \n"
                        + "(2) рассказ \n"
                        + "(3) стих \n",
                0, 0);
        start_story.direction[0].direction[2].direction[0].direction[1] = new Situation(
                "К сожалению не правильно. Правильный ответ : 46.",
                "Следующий вопрос: Жанр произведения А.С. Пушкина `Няне`? \n"
                        + "(1) сказка \n"
                        + "(2) рассказ \n"
                        + "(3) стих \n",
                0, 0);
        start_story.direction[0].direction[2].direction[0].direction[2] = new Situation(
                "Да, правильно!",
                "Следующий вопрос: Жанр произведения А.С. Пушкина `Няне`? \n"
                        + "(1) сказка \n"
                        + "(2) рассказ \n"
                        + "(3) стих \n",
                0, 1);
        start_story.direction[0].direction[2].direction[1].direction[0] = new Situation(
                "К сожалению не правильно. Правильный ответ : 1969.",
                "Следующий вопрос: Как называется прямая, ограниченная точками? \n"
                        + "(1) отрезок \n"
                        + "(2) луч \n"
                        + "(3) прямая \n",
                0, 0);
        start_story.direction[0].direction[2].direction[1].direction[1] = new Situation(
                "Да, правильно!",
                "Следующий вопрос: Как называется прямая, ограниченная точками? \n"
                        + "(1) отрезок \n"
                        + "(2) луч \n"
                        + "(3) прямая \n",
                0, 1);
        start_story.direction[0].direction[2].direction[1].direction[2] = new Situation(
                "К сожалению не правильно. Правильный ответ : 1969.",
                "Следующий вопрос: Как называется прямая, ограниченная точками? \n"
                        + "(1) отрезок \n"
                        + "(2) луч \n"
                        + "(3) прямая \n",
                0, 0);
        start_story.direction[1] = new Situation(
                "Хм...",
                "Думаю вам стоит настроится и ещё раз ответить на предыдущий вопрос.",
                0, 0);

        current_situation = start_story;
    }

    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }

    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}


