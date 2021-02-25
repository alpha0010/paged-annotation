import * as t from 'io-ts';

const AnnotationFile = t.array(
  t.type({
    strokes: t.array(
      t.type(
        {
          color: t.string,
          width: t.number,
          path: t.array(t.tuple([t.number, t.number])),
        },
        'Stroke',
      ),
    ),
    text: t.array(
      t.type(
        {
          color: t.string,
          fontSize: t.number,
          point: t.tuple([t.number, t.number]),
          str: t.string,
        },
        'PositionedText',
      ),
    ),
  }),
);

const data = JSON.parse('[... the data ...]');
if (AnnotationFile.is(data)) {
  // `data` is of valid format.
  // The variable also now has full TypeScript typings.
}
