from abc import ABC, abstractmethod


class Person:
    def __init__(self, name):
        self.name = name

    def __repr__(self):
        return f'Person(name={self.name})'


class PersonStorage(ABC):
    @abstractmethod
    def save(self, person):
        pass


class PersonDB(PersonStorage):
    def save(self, person):
        print(f'Simpan {person} ke dalam database')


class PersonJSON(PersonStorage):
    def save(self, person):
        print(f'Simpan {person} ke file JSON')


class PersonXML(PersonStorage):
    def save(self, person):
        print(f'Simpan {person} ke file XML')


if __name__ == '__main__':
    person = Person('Aziev Hanif')
    storage = PersonXML()
    storage.save(person)