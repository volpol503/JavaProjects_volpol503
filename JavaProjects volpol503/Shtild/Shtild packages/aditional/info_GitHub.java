
package aditional;

public class info_GitHub {

//Для открытия на всех устройствах во всех IDE сделать систему
//загрузки кода на GitHub также по созданию репозиториев для
//необходимых проектов
//pull - скачать
//push - загрузить
	
	
	//Команды терминала для Windows

	//1)cd "Название папки" oткрыть папку
	//2)cd.. - выйти из папки
	//3)dir все отображаемые папки внутри просматриваемой папки
	
	//Команды Git
	
	//1)git clone "https://github.com..." - скачавание репозитория по ссылке в просматриваемую папку
	//2)git status - просмотреть изменения эта первая команда для просмотра изменений в рабочей директории	
	//3)git add * - добавление изменений в базу данных git до выполнения коммита звездочка в данном случае "*" 
	//3)git commit - "Сканирование изменений в репозиторий" 
	//3.1)git commit -m "Сообщение" - сканирование сдделать снапшот
	//директории "-m" означает message сообщение 
	//3.2)git commit -u
	//4)git remote add <name> <URL> пульт который содержит информацию URL "HTTPS://github.com..." репозитория
	//4.1)git remote remove - удалить пульт
	//4.2)git remote add origin https://github.com/volpol503/XLSX-AD4-A.git
	
	//Название пультов
	//JPVP503
	
	//usage: git remote [-v | --verbose]
	//		   or: git remote add [-t <branch>] [-m <master>] [-f] [--tags | --no-tags] [--mirror=<fetch|push>] <name> <url>
	//		   or: git remote rename <old> <new>
	//		   or: git remote remove <name>
	//		   or: git remote set-head <name> (-a | --auto | -d | --delete | <branch>)
	//		   or: git remote [-v | --verbose] show [-n] <name>
	//		   or: git remote prune [-n | --dry-run] <name>
	//		   or: git remote [-v | --verbose] update [-p | --prune] [(<group> | <remote>)...]
	//		   or: git remote set-branches [--add] <name> <branch>...
	//		   or: git remote get-url [--push] [--all] <name>
	//		   or: git remote set-url [--push] <name> <newurl> [<oldurl>]
	//		   or: git remote set-url --add <name> <newurl>
	//		   or: git remote set-url --delete <name> <url>
	//
	//		   -v, --verbose         be verbose; must be placed before a subcommand
	
	
	
	
	
	//4.3)git remote add AD4AMain main - в этом примере AD4AMain название пульта main название ветки в репозитории
	//терминала в просматриваемую папку
	//5)git log - показывает все созданные коммиты на этом компьютере
	//6)git checkout -- <Назввание файла> - возвращение файла в состояние предыдущего коммита
	//6.1)git checkout -b <хеш код коммита> - здесь "-b" - branch название ветки
	
	//Работа с удалленным репозиторием
	
	//В этом режиме при работе с удаленными репозиториями не используется первоначально команда git clone "https://github.com..."
	//вначале создается папка git init затем необходимо создать пульт remote add 
	
	//10)git init - создание базы данных git при выполнении этой команды создается папка .git с базой данных изменений
	//11)git fetch -u origin master - здесь origin название пульта master название ветки При запуске команды выполняется
	//процесс "Resiving objects" в котором сравниваются файлы в удаленном репозитории и просматриваемой папки в которой создана
	//база данных и пульт git этот процесс будет настолько долгим насколько большой файл в репозитории
	//11.1)git fetch -f origin master то же самое что и git fetch -u origin master - по ка что не опробована разница в роботоспособности 
	//12)git push -f origin master - команда для отправки коммита в репозиторий с последующей заменой файлов в репозиторий
	//13)type nul > .gitignore - создать файл .gitignore "В командной строке для операционной системе Windows"
	//13.1)nano .gitignore - создать файл .gitignore "В командной строке для операционной системе linux"
	//при запуске
	//Лицевая часть репозитория это то что открывается на хостинге на GitHub при переходе по ссылке в репозитории и на лицевой части
	//показывает исходники последнего релиза проекта программы
	
	//Очистка репозитория от мусора
	
	//Для того чтобы не заполнять лишними удаленными файлами из коммитов, чтобы не засорять этими файлами базу данных созданными 
	//в самом начале лучшим способом это делать так называемую золотую копию или релиз версии программы в случае если загружать
	//нпример изображения или очередную копию папки с расчетом Excel и книгами то здесь лучше держать золотую копию или по другому
	//релиз своей программы как самого первого коммита в еденичном максимум двух экземплярах. Репозиторий для таких проектов должен 
	//постоянно чистится удалять нужно только первоначальные коммиты с переносом "золотой копии" в самый первый коммит далее если
	//будут новые коммиты их изменение не должно много весить по памяти все равно в случае переполнения репозитория мусором его
	//необходимо почистить от коммитов так как это описано ранее. Здесь не идет речи про проекты где в основном текстовые файлы
	//которые постоянно исправляются, не нужные файлы удаляются выставлять больше двух релизов
	
	//здесь желательно придерживаться такого правила что количество коммитов должно быть как можно меньше кратно по отношению к золотым
	//копиям возможно даже дробление на отдельные репозитории одного проекта на GitHub либо какой либо другой удаленный репозиторий
	//кратность коммитов к золотым копиям - релизам должно быть не больше трех коммитов на один релиз
	//важно понимать что всякий коммит различные решения которые приводят к удалению и замене большого количества больших файлов
	//приводит к засорению базы данных git и последующим тормозам при выполнении таких команд как
	//git fetch -f <Название пульта> <название ветки>
	//git clone "https://github.com..."
	
	//разница между fetch и clone
	
	//Есть идея запихать на GitHub практически все "грабли" которые можно предоставить в виде одной большой директории мастер ветки
	//например если я делаю расчет и использую литературу, книги и имею их в своей директории и excel файл ссылается на многие из этих
	//книг то рекомендуемые и те что не использованы я размещаю в масетр ветке. То есть там книг больше чем необходимо в проекте а сам
	//расчет проект я размещаю на отдельной ветке
	

	
	//*"Серьезный просчет при работе с репозиторием"*
	//это когда удаляется самый первый или почти самый превый коммит и заменяете копию самого последнего комита
	//после такой операции можно сразу удалять проект и делать его заного
	
	//Создание веток в репозитории и зачем это нужно
	
	//При работе с обычной консолью на на GitHub при последовательности действий когда клонируется репозиторий а затем производится push
	//появляется master ветка при первоначальном создании репозитория этой ветки нету


    //При работе с IntelLIJ_IDEA с разными несколькими SDK Dependencies папками "Модульные папки" в одном проекте зайти на папку проекта f4 в правом
    //Сайдбаре убрать эти папки из основной папки и импортировать эти папки в качестве модулей после чего можно сделать apply и назначать им SDK
//1)Shtild
//2)Swing
//3)Spring
//4)Java Program Design
//5)Java_Design_Patterns_Vaskaran_Sarcar
//6)Android_Apps
//7)
//8)
//
	
}