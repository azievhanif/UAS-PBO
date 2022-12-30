class PersonDB:
    def save(self, person):
        print(f'Simpan {person} ke dalam database')


class Person:
    def __init__(self, name):
        self.name = name
        self.db = PersonDB()

    def __repr__(self):
        return f'Person(name={self.name})'

    def save(self):
        self.db.save(person=self)


if __name__ == '__main__':
    p = Person('Aziev Hanif')
    p.save()