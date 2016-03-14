package Questions

trait Publication

class Book(length: Int, author: Author) extends Manuscript(length, author)

class Periodical(editor: Editor, issues: Seq[Issue]) extends Publication

class Issue(volume: Int, issueNumber: Int, manuscripts: Seq[Manuscript])

class Manuscript(length: Int, author: Author)

class Author

class Editor