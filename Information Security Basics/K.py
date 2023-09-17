objects = list(str(input("Введите объекты через запятую:")).split(","))
subject = list(input("Введите субъект:").split(","))
rules = ["read","enter", "create","delete"]
comands = ['end','permit','management','disable']

while True:
    # команды: end - закончить программу, permit "object" "rule" - позволить субъекту выбранное право,disable "object" "rule" - лишить субъект выбранного права
    #managment - переход к этапу управление объектами, purpose - возвращение к этапу назначения прав
    #права: read "object" "number of subject" - чтение объекта по заданному номеру, enter "subject" "number of object" - внесение изменений в объект по заданному номеру
    #create "subject" "info about object" - создать объект с указанной информацией в конце списка объектов, delete "subject" "number of object" - удалить объект по заданному номеру
    #
    action = list(input("Что вы хотите сделать?(Введите команду)").split(" "))
    if len(action) < 2:
        print("Не введено имя субъекта")
    elif action[0] == "end":
        break
    elif len(action) > 1 and action[1] == subject[0]:
        if action[0] == "permit":
            if action[2] in rules:
                if action[2] in subject:
                    print('Субъект уже обладает данным правом')
                else:
                    subject.insert(len(subject) + 1,action[2])
                    print("Право " + action[2] + " добавлено указанному субъекту")
            else:
                print("Указанного права не существует")
        elif action[0] == "disable":
            if action[2] in rules:
                for i in range(1, len(subject)):
                    if subject[i] == action[2]:
                        subject.pop(i)
                        print("Право " + action[2] + " удалено у указанного субъекта")
                else:
                    print("Субъект и так не обладает данным правом")
            else:
                print("Указанного права не существует")
    if action[0] == "management":
        while True:
            manage = list(input("Каким правом вы хотите воспользоваться?").split(" "))
            if manage[0] == 'purpose':
                break
            elif manage[0] =='read' and (manage[0] in subject):
                if int(manage[1]) > len(objects):
                    print("Не существует объекта под данным номером")
                else:
                 print('Информация об объекте:' + objects[int(manage[1])-1])
            elif manage[0] =='enter' and (manage[0] in subject):
                if int(manage[1]) > len(objects):
                    print("Не существует объекта под данным номером")
                else:
                    print('Информация об объекте:' + objects[int(manage[1])-1])
                    changed = input("Введите на что вы хотите изменить выбранный объект:")
                    objects[int(manage[1])] = changed
            elif manage[0] =='create' and (manage[0] in subject):
                objects.append(manage[1])
            elif manage[0] =='delete' and (manage[0] in subject):
                if int(manage[1]) > len(objects):
                    print("Не существует объекта под данным номером")
                else:
                    objects.append(manage[1])
            else:
                print("Субъект не обладает данным правом")
    elif len(action) > 1 and action[1] != subject[0]:
        print("Указан несуществующий субъект")
    elif action[0] not in comands:
        print("Введена несуществующая командa")
print(*objects," - итоговый список объектов")
print(subject[0]," - субъект\nЕго права -",subject[1:])
print("Работа программы закончена")
